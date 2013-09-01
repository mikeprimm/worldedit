// $Id$
/*
 * WorldEdit
 * Copyright (C) 2010 sk89q <http://www.sk89q.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldedit.regions.mailbox;

import com.sk89q.worldedit.LocalPlayer;
import com.sk89q.worldedit.WorldEditPermissionException;
import com.sk89q.worldedit.regions.mailbox.MailSystem.Access;

import java.util.HashMap;
import java.util.Map;

public class MailBox<T> {
    public enum Type {
        PRIVATE, PUBLIC, BROADCAST
    }

    private final String owner;
    private final Map<String, Mail<T>> mails = new HashMap<>();
    private Type type;

    public MailBox(String owner, Type type) {
        this.owner = owner;
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void send(LocalPlayer sender, String name, T contents) throws WorldEditPermissionException {
        checkPermission(sender, name, Access.WRITE);
        mails.put(name, new Mail<>(name, contents, sender.getName()));
    }

    private void checkPermission(LocalPlayer sender, String name, Access access) throws WorldEditPermissionException {
        final String senderName = sender.getName();
        if (senderName.equals(name)) {
            // All interaction with your own mailbox is always allowed
            return;
        }

        final Mail<T> mail = getMail(name);
        if (senderName.equals(mail.getSender())) {
            // All interaction with mails you sent is always allowed
            return;
        }

        final String typeString = type.name().toLowerCase();
        final String accessString = access.name().toLowerCase();
        final String permission = String.format("worldedit.selection.mail.%s.%s", typeString, accessString);

        sender.checkPermission(permission);
    }

    public Mail<T> getMail(String name) {
        return mails.get(name);
    }
}
