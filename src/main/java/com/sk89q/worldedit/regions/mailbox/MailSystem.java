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

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class MailSystem<T> {
    public enum Access {
        READ, WRITE, DELETE
    }

    MailBox<T> broadcast = new MailBox<T>("*", MailBox.Type.BROADCAST);

    private final Map<String, MailBox<T>> mailBoxes = new HashMap<String, MailBox<T>>();

    Pattern addressPattern = Pattern.compile("^([^@]+)@([^@]+)$");
    public void send(LocalPlayer sender, String address, T contents) throws WorldEditPermissionException {

    }
}
