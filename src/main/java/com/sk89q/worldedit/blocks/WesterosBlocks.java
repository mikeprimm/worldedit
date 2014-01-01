package com.sk89q.worldedit.blocks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class WesterosBlocks {
    public static final int WB_ARROW_SLITS = 2024;
    public static final int WB_BANNER_BLOCK_0 = 2070;
    public static final int WB_BANNER_BLOCK_1 = 2094;
    public static final int WB_BANNER_BLOCK_2 = 2095;
    public static final int WB_BANNER_BLOCK_3 = 2096;
    public static final int WB_BANNER_BLOCK_4 = 2097;
    public static final int WB_BANNER_BLOCK_5 = 2098;
    public static final int WB_BANNER_BLOCK_6 = 2099;
    public static final int WB_BANNER_BLOCK_7 = 2100;
    public static final int WB_BANNER_BLOCK_8 = 2101;
    public static final int WB_BANNER_BLOCK_9 = 2102;
    public static final int WB_BANNER_BLOCK_10 = 2103;
    public static final int WB_BANNER_BLOCK_11 = 2104;
    public static final int WB_BANNER_BLOCK_12 = 2105;
    public static final int WB_BANNER_BLOCK_13 = 2106;
    public static final int WB_BARS_IRON_BLOCK_0 = 2011;
    public static final int WB_BED_BLOCK_0 = 2081;
    public static final int WB_BED_BLOCK_1 = 2082;
    public static final int WB_BED_BLOCK_2 = 2083;
    public static final int WB_BED_BLOCK_3 = 2084;
    public static final int WB_BED_BLOCK_4 = 2085;
    public static final int WB_BED_BLOCK_5 = 2086;
    public static final int WB_BED_BLOCK_6 = 2087;
    public static final int WB_BED_BLOCK_7 = 2088;
    public static final int WB_BED_BLOCK_8 = 2089;
    public static final int WB_BEDROCK_STAIRS = 2117;
    public static final int WB_BENCH_BLOCK_0 = 2023;
    public static final int WB_BOOKSHELVES_BLOCK_0 = 2028;
    public static final int WB_BROWN_MUSHROOM_BLOCK_0 = 2061;
    public static final int WB_COBBLE_DARK_STAIRS = 2118;
    public static final int WB_CRATE_BLOCK_0 = 2018;
    public static final int WB_CUBOID_BLOCK_0 = 2013;
    public static final int WB_CUBOID_BLOCK_1 = 2064;
    public static final int WB_CUBOID_BLOCK_2 = 2065;
    public static final int WB_CUBOID_BLOCK_3 = 2066;
    public static final int WB_DOUB_WATTLE_BLOCKS = 2031;
    public static final int WB_FENCE_BLOCK_0 = 2009;
    public static final int WB_FENCE_BLOCK_1 = 2052;
    public static final int WB_GLASSPANE_NET = 2057;
    public static final int WB_HALFDOOR_BLOCK_0 = 2055;
    public static final int WB_HALFDOOR_BLOCK_1 = 2056;
    public static final int WB_HALFDOOR_BLOCK_2 = 2090;
    public static final int WB_HOPPER_BLOCK = 2067;
    public static final int WB_HOPPER_BLOCK_1 = 2068;
    public static final int WB_LADDER_BLOCK_0 = 2054;
    public static final int WB_LEAVES_BLOCK_0 = 2016;
    public static final int WB_LEAVES_BLOCK_1 = 2017;
    public static final int WB_LEAVES_BLOCK_2 = 2077;
    public static final int WB_LIGHT_EMITTING_BLOCKS_0 = 2032;
    public static final int WB_LOG_BLOCK_0 = 2004;
    public static final int WB_LOG_BLOCK_1 = 2027;
    public static final int WB_LOG_BLOCK_2 = 2058;
    public static final int WB_LOG_BLOCK_3 = 2076;
    public static final int WB_LOG_BLOCK_4 = 2093;
    public static final int WB_METAL_BLOCK_0 = 2000;
    public static final int WB_METAL_BLOCK_0_STAIR_1 = 2003;
    public static final int WB_METAL_BLOCK_0_STAIR_2 = 2107;
    public static final int WB_METAL_BLOCK_0_STAIR_3 = 2108;
    public static final int WB_METAL_BLOCK_0_STAIR_4 = 2109;
    public static final int WB_METAL_BLOCK_0_STAIR_5 = 2110;
    public static final int WB_METAL_BLOCK_0_STAIR_6 = 2111;
    public static final int WB_METAL_BLOCK_0_STAIR_7 = 2112;
    public static final int WB_METAL_SLAB_BLOCK_0 = 2008;
    public static final int WB_METAL_SLAB_BLOCK_0_2 = 2020;
    public static final int WB_NORTHERN_WOOD_STAIRS = 2114;
    public static final int WB_ORANGE_BRICK_STAIR_0 = 2092;
    public static final int WB_PISTON_BLOCK_0 = 2069;
    public static final int WB_RANDOM_SLAB_BLOCK_0 = 2047;
    public static final int WB_RANDOM_SLAB_BLOCK_0_2 = 2048;
    public static final int WB_RANDOM_SLAB_BLOCK_1 = 2078;
    public static final int WB_RANDOM_SLAB_BLOCK_1_2 = 2079;
    public static final int WB_RED_FLOWER_BLOCK_0 = 2059;
    public static final int WB_RED_FLOWER_BLOCK_1 = 2060;
    public static final int WB_RED_MUSHROOM_BLOCK_0 = 2062;
    public static final int WB_ROPE_BLOCK_0 = 2080;
    public static final int WB_ROPE_BLOCK_1 = 2091;
    public static final int WB_ROPE_BLOCK_2 = 2119;
    public static final int WB_SAND_BLOCK_0 = 2012;
    public static final int WB_SAND_LAYER_0 = 2021;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_0 = 2015;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_1 = 2035;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_2 = 2036;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_3 = 2037;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_4 = 2038;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_5 = 2039;
    public static final int WB_SANDSTONE_BLOCK_0_STAIR_8 = 2040;
    public static final int WB_SIX_SIDED_BLOCKS_0 = 2026;
    public static final int WB_SMOKE_BLOCK_0 = 2053;
    public static final int WB_SNOW_STAIRS = 2113;
    public static final int WB_SOLID_BLOCKS_0 = 2033;
    public static final int WB_SOULSAND_LIKE_BLOCKS_0 = 2034;
    public static final int WB_SOUND_BLOCKS_0 = 2072;
    public static final int WB_STONE_BLOCK_0 = 2025;
    public static final int WB_STONE_BLOCK_1 = 2029;
    public static final int WB_STONE_BLOCK_1_STAIR_0 = 2043;
    public static final int WB_STONE_BLOCK_1_STAIR_1 = 2044;
    public static final int WB_STONE_BLOCK_1_STAIR_2 = 2049;
    public static final int WB_STONE_BLOCK_1_STAIR_3 = 2050;
    public static final int WB_STONE_BLOCK_1_STAIR_4 = 2051;
    public static final int WB_STONE_BLOCK_2 = 2071;
    public static final int WB_STONE_SLAB_BLOCK_0 = 2041;
    public static final int WB_STONE_SLAB_BLOCK_0_2 = 2042;
    public static final int WB_STONE_SLAB_BLOCK_1 = 2045;
    public static final int WB_STONE_SLAB_BLOCK_1_2 = 2046;
    public static final int WB_STONE_SLAB_STAIR_0 = 2075;
    public static final int WB_STONE_WALL_BLOCK_0 = 2010;
    public static final int WB_THATCH_STAIR_0 = 2073;
    public static final int WB_THATCH_STAIR_1 = 2074;
    public static final int WB_THIN_LOG_0 = 2022;
    public static final int WB_TORCH_BLOCK_0 = 2014;
    public static final int WB_UNSHADED_GRASS_BLOCK_0 = 2063;
    public static final int WB_WOOD_COLOURS = 2030;
    public static final int WB_WOOD_SLAB_BLOCK_0 = 2115;
    public static final int WB_WOOD_SLAB_BLOCK_0_2 = 2116;
    public static final int WB_YELLOW_FLOWER_BLOCK_0 = 2005;
    public static final int WB_YELLOW_FLOWER_BLOCK_1 = 2006;
    
    // Block type of matching block
    public BlockType blockType;
    // Block data (-1 if non-specific data)
    public int data;
    
    private static HashMap<String, WesterosBlocks> lookupTable = new HashMap<String, WesterosBlocks>();
    
    static {
        new WesterosBlocks(BlockType.WB_METAL_BLOCK_0, 0, "oxidizediron");
        new WesterosBlocks(BlockType.WB_METAL_BLOCK_0, 1, "oxidizedbronze");
        new WesterosBlocks(BlockType.WB_METAL_BLOCK_0, 2, "oxidizedsteel");
        new WesterosBlocks(BlockType.WB_METAL_BLOCK_0, 3, "moltenblades");
        new WesterosBlocks(BlockType.WB_METAL_BLOCK_0, 4, "goldingots");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_0, 0, "closedbarrel");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_0, 1, "firewood");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_0, 2, "oaklogrope");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_0, 3, "oaklogchain");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_1, 0, "weirwoodface");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_1, 1, "mossyoaklog");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_1, 2, "marblepillar");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_1, 3, "marblepillarvertical");
        for (int i = 0; i < 16; i++) {
            new WesterosBlocks(BlockType.WB_YELLOW_FLOWER_BLOCK_0, i, "yellowflower" + (i+1));
        }
        for (int i = 0; i < 9; i++) {
            new WesterosBlocks(BlockType.WB_YELLOW_FLOWER_BLOCK_1, i+16, "yellowflower" + (i+17));
        }
        new WesterosBlocks(BlockType.WB_YELLOW_FLOWER_BLOCK_1, 9, "strawberrybush");

        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 0, "ironslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 1, "oxidizedironslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 2, "bronzeslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 3, "oxidizedbronzeslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 4, "oxidizedsteelslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 5, "steelslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0, 6, "goldbrockslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 0, "doubleironslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 1, "doubleoxidizedironslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 2, "doublebronzeslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 3, "doubleoxidizedbronzeslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 4, "doubleoxidizedsteelslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 5, "doublesteelslab");
        new WesterosBlocks(BlockType.WB_METAL_SLAB_BLOCK_0_2, 6, "doublegoldbrockslab");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 0, "oakfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 1, "sprucefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 2, "birchfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 3, "junglefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 4, "oakbarkfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 5, "sprucebarkfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 6, "birchbarkfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 7, "junglebarkfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 8, "oakfencewithvines", "oakfencevines");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 9, "sprucefencewithvines", "sprucefencevines");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 10, "birchfencewithvines", "birchfencevines");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 11, "junglefencewithvines", "junglefencevines");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 12, "oakfencewithgrapes", "oakfencegrapes");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 13, "sprucefencewithgrapes", "sprucefencegrapes");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 14, "birchfencewithgrapes", "birchfencegrapes");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_0, 15, "junglefencewithgrapes", "junglefencegrapes");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 0, "netherbrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 1, "stonebrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 2, "brickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 3, "desertsandstonebrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 4, "redsandstonebrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 5, "darkcobblewall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 6, "bedrockwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 7, "smallstonebrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 8, "darkredbrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 9, "smallbrickwall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 10, "lightgreystonewall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 11, "marblewall");
        new WesterosBlocks(BlockType.WB_STONE_WALL_BLOCK_0, 12, "thinmarblecolumn");
        new WesterosBlocks(BlockType.WB_THIN_LOG_0, 0, "thinoaklog");
        new WesterosBlocks(BlockType.WB_THIN_LOG_0, 1, "thinsprucelog");
        new WesterosBlocks(BlockType.WB_THIN_LOG_0, 2, "thinbirchlog");
        new WesterosBlocks(BlockType.WB_THIN_LOG_0, 3, "thinjunglelog");
        new WesterosBlocks(BlockType.WB_BARS_IRON_BLOCK_0, 0, "ironcrossbar");
        new WesterosBlocks(BlockType.WB_BARS_IRON_BLOCK_0, 1, "oxidizedironbars");
        new WesterosBlocks(BlockType.WB_BARS_IRON_BLOCK_0, 2, "oxidizedironcrossbar");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 0, "sandskeleton");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 1, "wetsand");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 2, "terracottasand");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 3, "pinkorangesand");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 4, "redsand");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 5, "sandstones");
        new WesterosBlocks(BlockType.WB_SAND_BLOCK_0, 6, "wetsandstones");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_0, 0, "axeblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_0, 1, "cleaverblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_0, 2, "daggerblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_0, 3, "pickaxeblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_1, 0, "shovelblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_1, 1, "ironhalfdoor");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 0, "horseshoes");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 1, "clothesline");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 2, "swordrack");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 3, "coins");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 4, "fryingpan");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 5, "brokensword");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_2, 6, "bones");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 0, "pewterplate");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 1, "woodenplate");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 2, "lantern");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 3, "unlitcandle");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 4, "pewterflagon");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 5, "glassflagon");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 6, "table");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 7, "breadblock");
        new WesterosBlocks(BlockType.WB_CUBOID_BLOCK_3, 8, "cheeseblock");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 0, "applefruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 1, "apricotfruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 2, "cherryfruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 3, "grapefruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 4, "lemonfruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 5, "limefruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_0, 7, "peachfruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 0, "plumfruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 1, "pomegrenadefruitleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 2, "weirwoodleaves");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 3, "blackberrybush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 4, "blueberrybush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 5, "raspberrybush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 6, "juniperbush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_1, 7, "redrosebush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_2, 0, "pinkrosebush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_2, 1, "whiterosebush");
        new WesterosBlocks(BlockType.WB_LEAVES_BLOCK_2, 2, "yellowrosebush");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 0, "crate1");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 1, "crate2");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 2, "crate3");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 3, "opencrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 4, "turnipcrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 5, "fishcrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 6, "graincrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 7, "applecrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 8, "carrotcrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 9, "saltcrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 10, "ironcrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 11, "berrycrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 12, "waterbarrel");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 13, "emptybarrel");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 14, "grapecrate");
        new WesterosBlocks(BlockType.WB_CRATE_BLOCK_0, 15, "silvertincrate");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 0, "benchbutcherknives");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 1, "benchcarpentryhammersaw");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 2, "benchdrawers");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 3, "benchkitchenknives");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 4, "benchkitchenpans");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 5, "benchmasonhammermallet");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 7, "tabledrawers");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 8, "tablebooks");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 9, "tablewidgets");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 10, "fullcabinet");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 11, "emptycabinet");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 12, "brokencabinet");
        new WesterosBlocks(BlockType.WB_BENCH_BLOCK_0, 13, "cabinetdrawer");
        new WesterosBlocks(BlockType.WB_BOOKSHELVES_BLOCK_0, 0, "bookshelflibrary");
        new WesterosBlocks(BlockType.WB_BOOKSHELVES_BLOCK_0, 1, "bookshelfmaester");
        new WesterosBlocks(BlockType.WB_BOOKSHELVES_BLOCK_0, 2, "bookshelfabandoned");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 0, "smallstonebrickarrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 1, "stonebrickarrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 2, "mossystonebrickarrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 3, "stonebrickwindow");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 4, "colouredseptwindow");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 5, "septcrystal");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 6, "fishtrap");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 7, "cage");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 8, "netherbrickarrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 9, "sesertsandstonearrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 10, "vividsandstonearrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 11, "terracottaarrowslit");
        new WesterosBlocks(BlockType.WB_ARROW_SLITS, 12, "stoneslabarrowslit");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 0, "darkbrownsandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 1, "vividsandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 2, "vividmossysandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 3, "vividdarksandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 4, "largebricksandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 5, "monochromesandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 6, "monochromemossysandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 7, "monochromedarksandstone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 8, "terracotta");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 9, "terracottaengraved");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 10, "greykeystone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 11, "sandystoneslabs");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 12, "darkbricks");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 13, "netherbrickkeystone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 14, "darkcobble");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_0, 15, "smallbricksornatetop");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 0, "pistontop");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 1, "sixsidedoak");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 2, "sixsidedspruce");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 3, "sixsidedbirch");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 4, "sixsidedjungle");
        new WesterosBlocks(BlockType.WB_SIX_SIDED_BLOCKS_0, 5, "sixsidedstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 0, "terrainseteasternislands", "easternislands");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 1, "terrainsetironislands", "ironislands");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 2, "terrainsetmountainsofthemoon", "mountainsofthemoon");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 3, "terrainsetthenorth", "thenorth");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 4, "terrainsetoceanrocks", "oceanrocks");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 5, "terrainsetredmountains", "redmountains");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 6, "terrainsetriverrocks", "riverrocks");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 7, "terrainsetwesterlands", "westerlands");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 8, "terrainsetarbordorne", "arbordorne");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 9, "lightgreystone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 10, "smallstonebrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 11, "blackslate");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 12, "blueslate");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 13, "redslate");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 14, "lannisportorangeplaster", "orangeplaster");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_1, 15, "lannisportyellowplaster", "yellowplaster");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 0, "purplewood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 1, "whitewood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 2, "greenwood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 3, "graywood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 4, "redwood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 5, "blackwood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 6, "bluewood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 7, "yellowwood");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 8, "parquetfloor");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 9, "thatchlightfur");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 10, "thatchdarkfur");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 11, "leather");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 12, "northerncarvings");
        new WesterosBlocks(BlockType.WB_WOOD_COLOURS, 13, "darknorthernwood");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 0, "daubwattlebrowncrosshatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 1, "daubwattlebrownlefthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 2, "daubwattlebrownrighthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 3, "daubwattlebrownframe");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 4, "daubwattlewhitecrosshatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 5, "daubwattlewhitelefthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 6, "daubwattlewhiterighthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 7, "daubwattlewhiteframe");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 8, "daubwattleredcrosshatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 9, "daubwattleredlefthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 10, "daubwattleredrighthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 11, "daubwattleredframe");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 12, "daubbrickcrosshatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 13, "daubbricklefthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 14, "daubbrickrighthatch");
        new WesterosBlocks(BlockType.WB_DOUB_WATTLE_BLOCKS, 15, "daubbrickframe");
        new WesterosBlocks(BlockType.WB_LIGHT_EMITTING_BLOCKS_0, 0, "redlantern");
        new WesterosBlocks(BlockType.WB_LIGHT_EMITTING_BLOCKS_0, 1, "glowingembers");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 0, "bonedirt");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 1, "scorchedearth");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 2, "dates");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 3, "fallenleaves");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 4, "pineneedles");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 5, "spitroast");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 6, "squash");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 7, "plainwhitedaub");
        new WesterosBlocks(BlockType.WB_SOLID_BLOCKS_0, 8, "plainbrowndaub");
        new WesterosBlocks(BlockType.WB_SOULSAND_LIKE_BLOCKS_0, 0, "mud");
        new WesterosBlocks(BlockType.WB_SOULSAND_LIKE_BLOCKS_0, 1, "bog");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 0, "vividsandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 1, "vividdarksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 2, "monochromesandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 3, "monochromedarksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 4, "darkbrownsandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 5, "largebricksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0, 6, "lannisportorangebrickslab", "orangebrickslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 0, "doublevividsandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 1, "doublevividdarksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 2, "doublemonochromesandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 3, "doublemonochromedarksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 4, "doubledarkbrownsandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 5, "doublelargebricksandstoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_0_2, 6, "doublelannisportorangebrickslab", "doubleorangebrickslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 0, "smallstonebrickslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 1, "lightgreystoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 2, "terracottaslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 3, "blackslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 4, "blueslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 5, "redslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 6, "bedrockslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1, 7, "darkcobbleslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 0, "doublesmallstonebrickslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 1, "doublelightgreystoneslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 2, "doubleterracottaslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 3, "doubleblackslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 4, "doubleblueslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 5, "doubleredslateslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 6, "doublebedrockslab");
        new WesterosBlocks(BlockType.WB_STONE_SLAB_BLOCK_1_2, 7, "doubledarkcobbleslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 0, "dirtslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 1, "gravelslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 2, "thatchlightfurslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 3, "thatchdarkfurslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 4, "leatherslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 5, "stool");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0, 6, "stoolcushion");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 0, "doubledirtslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 1, "doublegravelslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 2, "doublethatchlightfurslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 3, "doublethatchdarkfurslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 4, "doubleleatherslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 5, "doublestool");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_0_2, 6, "doublestoolcushion");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1, 0, "grainfloursack");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1, 1, "cutgrainfloursack");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1, 2, "snowslab");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1_2, 0, "doublegrainfloursack");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1_2, 1, "doublecutgrainfloursack");
        new WesterosBlocks(BlockType.WB_RANDOM_SLAB_BLOCK_1_2, 2, "doublesnowslab");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 0, "cobblestonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 1, "mossycobblestonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 2, "reinforcedoakfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 3, "desertsandstonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 4, "vividsandstonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 5, "vividdarksandstonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 6, "monochromesandstonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 7, "monochromedarksandstonefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 8, "terracottafence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 9, "darknorthernwoodfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 10, "smallstonebrickfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 11, "darkcobblefence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 12, "bedrockfence");
        new WesterosBlocks(BlockType.WB_FENCE_BLOCK_1, 13, "lightgreystonefence");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 0, "smoke");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 1, "verticalrope");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 2, "ropeblockharness");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 3, "verticalchain");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 4, "chainblockharness");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 5, "bees");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 6, "flies");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 7, "icicle");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 8, "sausageslegofham");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 9, "deadhare");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 10, "deadfowl");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 11, "deadfish");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 12, "garlicstrand");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 13, "bushelofherbs");
        new WesterosBlocks(BlockType.WB_SMOKE_BLOCK_0, 14, "chiliristra");
        new WesterosBlocks(BlockType.WB_LADDER_BLOCK_0, 0, "ironrungs");
        new WesterosBlocks(BlockType.WB_LADDER_BLOCK_0, 1, "ropeladder");
        new WesterosBlocks(BlockType.WB_LADDER_BLOCK_0, 2, "vinejasmine");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_2, 0, "archerytarget");
        for (int i = 0; i < 16; i++) {
            new WesterosBlocks(BlockType.WB_RED_FLOWER_BLOCK_0, i, "redflower" + (i+1));
        }
        for (int i = 0; i < 9; i++) {
            new WesterosBlocks(BlockType.WB_RED_FLOWER_BLOCK_1, i, "redflower" + (i+17));
        }
        new WesterosBlocks(BlockType.WB_RED_FLOWER_BLOCK_1, 9, "cranberrybush");
        for (int i = 0; i < 13; i++) {
            new WesterosBlocks(BlockType.WB_BROWN_MUSHROOM_BLOCK_0, i, "brownmushroom" + (i+1));
        }
        for (int i = 0; i < 9; i++) {
            new WesterosBlocks(BlockType.WB_RED_MUSHROOM_BLOCK_0, i, "redmushroom" + (i+1));
        }
        new WesterosBlocks(BlockType.WB_UNSHADED_GRASS_BLOCK_0, 0, "unshadedgrass");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 0, "sprucehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 1, "birchhopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 2, "junglehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 3, "cobblestonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 4, "mossycobblestonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 5, "netherbrickhopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 6, "desertsandstonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 7, "vividsandstonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 8, "vividdarksandstonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 9, "monochromesandstonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 10, "monochromedarksandstonehopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK, 11, "terracottahopper");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK_1, 0, "blackslatetip");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK_1, 1, "blueslatetip");
        new WesterosBlocks(BlockType.WB_HOPPER_BLOCK_1, 2, "redslatetip");
        new WesterosBlocks(BlockType.WB_PISTON_BLOCK_0, 0, "pistonextension");
        new WesterosBlocks(BlockType.WB_PISTON_BLOCK_0, 1, "wagonwheelandaxle");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_0, 0, "greybanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_0, 1, "greybannertop");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 0, "lannisportkeystoneorangeplaster", "keystoneorangeplaster");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 1, "lannisportkeystoneyellowplaster", "keystoneyellowplaster");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 2, "lannisportlightbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 3, "northerncobble");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 4, "icynortherncobble");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 5, "reachlightbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 6, "reachpinklightbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 7, "reachpinkcobblestone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 8, "reachpinkbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 9, "lannisportorangebrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 10, "stormlandscobblestone");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 11, "stormlandsbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 12, "stormlandslargebrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 13, "stormlandssmalllightbrick");
        new WesterosBlocks(BlockType.WB_STONE_BLOCK_2, 14, "lightstone");
        new WesterosBlocks(BlockType.WB_SOUND_BLOCKS_0, 0, "forestsounds");
        new WesterosBlocks(BlockType.WB_SOUND_BLOCKS_0, 1, "farmsounds");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_3, 0, "mossysprucelog");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_3, 1, "mossybirchlog");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_3, 1, "mossyjunglelog");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_4, 0, "sprucelogrope");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_4, 1, "sprucelogchain");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_4, 2, "junglelogrope");
        new WesterosBlocks(BlockType.WB_LOG_BLOCK_4, 3, "junglelogchain");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_1, 0, "redbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_1, 1, "redbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_2, 0, "blackbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_2, 1, "blackbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_3, 0, "thefaithofthesevenbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_3, 1, "thefaithofthesevenbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_4, 0, "creambanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_4, 1, "creambannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_5, 0, "bluebanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_5, 1, "bluebannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_6, 0, "brownbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_6, 1, "brownbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_7, 0, "cyanbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_7, 1, "cyanbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_8, 0, "greenbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_8, 1, "greenbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_9, 0, "orangebanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_9, 1, "orangebannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_10, 0, "pinkandpurplebanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_10, 1, "pinkandpurplebannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_11, 0, "purplebanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_11, 1, "purplebannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_12, 0, "lordoflightbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_12, 1, "lordoflightbannertop");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_13, 0, "yellowbanner");
        new WesterosBlocks(BlockType.WB_BANNER_BLOCK_13, 1, "yellowbannertop");
        new WesterosBlocks(BlockType.WB_WOOD_SLAB_BLOCK_0, 0, "darknorthernwoodslab");
        new WesterosBlocks(BlockType.WB_WOOD_SLAB_BLOCK_0_2, 0, "doubledarknorthernwoodslab");
        
        // Build and dump current symbol map
        HashMap<Integer, List<String>> mapbyID = new HashMap<Integer, List<String>>();
        HashMap<String, Integer> mapbykey = new HashMap<String, Integer>();
        for (String k : lookupTable.keySet()) {
            WesterosBlocks wb = lookupTable.get(k);
            int id = (wb.blockType.getID() * 32) + wb.data + 1;
            List<String> lst = mapbyID.get(id);
            if (lst == null) {
                lst = new ArrayList<String>();
                mapbyID.put(id, lst);
            }
            lst.add(k);
            mapbykey.put(k, id);
        }
        for (BlockType bt : BlockType.values()) {
            int id = bt.getID() * 32;
            List<String> lst = mapbyID.get(id);
            if (lst == null) {
                lst = new ArrayList<String>();
                mapbyID.put(id, lst);
            }
            for (String k : bt.lookupKeys) {
                lst.add(k);
                mapbykey.put(k, id);
            }
        }
        for (ClothColor cc : ClothColor.values()) {
            int id = (BlockType.CLOTH.getID() * 32) + cc.getID() + 1;
            List<String> lst = mapbyID.get(id);
            if (lst == null) {
                lst = new ArrayList<String>();
                mapbyID.put(id, lst);
            }
            for (String k : cc.lookupKeys) {
                lst.add(k);
                mapbykey.put(k, id);
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter("worldedit-keys.txt");
            TreeSet<Integer> ts = new TreeSet<Integer>(mapbyID.keySet());
            for (Integer id : ts) {
                List<String> keys = mapbyID.get(id);
                fw.write((id / 32) + ":" + (((id%32) == 0)?"*":((id%32)-1)) + " ");
                for (String k : keys) {
                    fw.write(" " + k);
                }
                fw.write("\n");
            }
            fw.write("-------------------------------\n");
            TreeSet<String> tss = new TreeSet<String>(mapbykey.keySet());
            for (String k : tss) {
                Integer id = mapbykey.get(k);
                fw.write(k + " " + (id / 32) + ":" + (((id%32) == 0)?"*":((id%32)-1)) + "\n");
            }
        } catch (IOException iox) {
        } finally {
            if (fw != null) {
                try { fw.close(); } catch (IOException iox) {}
                fw = null;
            }
        }
    }
    
    private WesterosBlocks(BlockType bt, int data, String... lookupKeys) {
        blockType = bt;
        this.data = data;
        for (String k : lookupKeys) {
            if (BlockType.lookup(k) != null) {
                System.out.println("WesterosBlocks key '" + k + "' conflicts with BlockType");
            }
            if (lookupTable.containsKey(k)) {
                System.out.println("WesterosBlocks key '" + k + "' has duplicates");
            }
            lookupTable.put(k, this);
        }
    }
    // Lookup WB
    public static WesterosBlocks lookup(String id) {
        return lookupTable.get(id);    // Look up in our table
    }
}
