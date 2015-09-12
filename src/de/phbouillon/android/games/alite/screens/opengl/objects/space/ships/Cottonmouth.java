package de.phbouillon.android.games.alite.screens.opengl.objects.space.ships;

/* Alite - Discover the Universe on your Favorite Android Device
 * Copyright (C) 2015 Philipp Bouillon
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful and
 * fun, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * http://http://www.gnu.org/licenses/gpl-3.0.txt.
 */

/**
 * Cottonmouth model and texture by Rolf Schuetteler
 */

import de.phbouillon.android.framework.impl.gl.GlUtils;
import de.phbouillon.android.framework.math.Vector3f;
import de.phbouillon.android.games.alite.Alite;
import de.phbouillon.android.games.alite.Settings;
import de.phbouillon.android.games.alite.model.statistics.ShipType;
import de.phbouillon.android.games.alite.screens.opengl.ingame.EngineExhaust;
import de.phbouillon.android.games.alite.screens.opengl.ingame.ObjectType;
import de.phbouillon.android.games.alite.screens.opengl.objects.space.SpaceObject;

public class Cottonmouth extends SpaceObject {
	private static final long serialVersionUID = -5280545827741204811L;

	public static final Vector3f HUD_COLOR = new Vector3f(0.55f, 0.67f, 0.94f);

    private static final float [] VERTEX_DATA = new float [] {
        103.05f, -65.00f, -66.54f, 132.00f, -46.26f, -66.54f, 
        103.05f, -65.00f, -239.68f, 132.00f, -19.75f, -66.54f, 
        132.00f, -46.26f, -239.68f, 103.05f,  -1.01f, -66.54f, 
        132.00f, -19.75f, -239.68f,  74.09f, -19.75f, -66.54f, 
        103.05f,  -1.01f, -239.68f,  74.09f, -46.26f, -66.54f, 
         74.09f, -46.26f, -239.68f,  74.09f, -46.26f, -182.40f, 
         74.09f, -46.26f, -123.82f,  74.09f, -19.75f, -239.68f, 
         74.09f, -19.75f, -182.40f,  74.09f, -19.75f, -123.82f, 
        -74.35f, -19.76f, -123.82f, -74.35f, -19.76f, -182.40f, 
          8.55f, -13.25f, 239.68f,   8.55f, -34.54f, 239.68f, 
        -12.16f, -34.54f, 239.68f, -12.16f, -13.25f, 239.68f, 
        -74.35f, -46.26f, -182.40f, -74.35f, -46.26f, -123.82f, 
        -103.18f, -65.00f, -66.54f, -74.35f, -46.26f, -66.54f, 
        -103.18f, -65.00f, -239.68f, -74.35f, -19.76f, -66.54f, 
        -103.18f,  -1.01f, -66.54f, -103.18f,  -1.01f, -239.68f, 
        -74.35f, -19.76f, -239.68f, -132.00f, -19.76f, -66.54f, 
        -132.00f, -19.76f, -239.68f, -132.00f, -46.26f, -66.54f, 
        -132.00f, -46.26f, -239.68f, -74.35f, -46.26f, -239.68f, 
         50.95f, -58.55f, -56.59f,  41.76f,  45.43f, -56.59f, 
        -51.36f, -58.55f, -56.59f, -48.48f,  14.89f, -218.67f, 
         48.49f,  14.89f, -218.67f,  24.62f,  65.00f, -218.69f, 
        -24.86f,  65.00f, -218.69f,  39.69f, -52.91f,  88.75f, 
         26.72f,  40.65f,  21.54f, -41.64f, -52.91f,  88.75f, 
        -42.41f,  45.43f, -56.59f, -28.47f,  40.65f,  21.54f, 
         24.02f, -43.61f, 115.87f,  21.04f,  40.35f, 115.87f, 
        -26.08f, -43.61f, 115.87f, -23.09f,  40.34f, 115.87f, 
         23.50f, -43.61f, 199.00f,  17.76f,  24.52f, 199.00f, 
        -26.60f, -43.61f, 199.00f, -20.86f,  24.52f, 199.00f, 
         48.33f,  -0.16f, -150.57f, -48.64f,  -0.16f, -150.57f, 
         24.46f,  63.02f, -89.33f, -25.02f,  63.02f, -89.33f
    };

    private static final float [] NORMAL_DATA = new float [] {
         -0.54340f,   0.83947f,  -0.00000f,  -1.00000f,  -0.00000f,  -0.00000f, 
         -0.54340f,  -0.83948f,  -0.00000f,   0.54340f,  -0.83947f,   0.00000f, 
          0.54339f,   0.83948f,   0.00000f,   0.54339f,   0.83948f,   0.00000f, 
          0.54339f,   0.83948f,   0.00000f,   0.54339f,   0.83948f,   0.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,  -0.00000f,  -1.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
         -0.00000f,  -0.00000f,   1.00000f,  -0.00000f,  -0.00000f,   1.00000f, 
         -0.00000f,   0.00000f,   1.00000f,  -0.00000f,  -0.00000f,   1.00000f, 
          1.00000f,   0.00000f,   0.00000f,   1.00000f,   0.00000f,   0.00000f, 
          1.00000f,   0.00000f,   0.00000f,   0.00000f,  -1.00000f,   0.00000f, 
          0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -0.00000f,  -1.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,  -0.00000f,   1.00000f,  -0.00000f, 
         -0.00000f,   1.00000f,  -0.00000f,  -0.00000f,  -0.00000f,   1.00000f, 
         -0.00000f,  -0.00000f,   1.00000f,  -0.54511f,   0.83837f,  -0.00000f, 
         -0.54510f,  -0.83837f,  -0.00000f,  -0.54511f,  -0.83837f,  -0.00000f, 
         -0.54511f,  -0.83837f,  -0.00000f,  -0.54511f,  -0.83837f,  -0.00000f, 
          0.54511f,  -0.83837f,   0.00000f,   0.54511f,  -0.83836f,   0.00000f, 
          1.00000f,   0.00000f,   0.00000f,   1.00000f,   0.00000f,   0.00000f, 
          0.54510f,   0.83837f,   0.00000f,   0.54510f,   0.83837f,   0.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,  -0.00000f,  -1.00000f, 
          0.00000f,  -0.00000f,  -1.00000f,   0.00000f,   0.00000f,  -1.00000f, 
         -0.00000f,  -0.00000f,   1.00000f,  -0.00000f,  -0.00000f,   1.00000f, 
         -0.00000f,  -0.00000f,   1.00000f,  -0.00000f,   0.00000f,   1.00000f, 
         -1.00000f,  -0.00000f,  -0.00000f,  -1.00000f,  -0.00000f,  -0.00000f, 
         -1.00000f,  -0.00000f,  -0.00000f,  -0.94555f,  -0.00000f,  -0.32549f, 
         -0.92686f,  -0.08199f,  -0.36636f,  -0.00000f,   0.98371f,   0.17978f, 
         -0.00000f,   0.98371f,   0.17978f,   0.94617f,   0.00000f,  -0.32367f, 
         -0.00000f,   0.00035f,   1.00000f,  -0.00000f,   0.00035f,   1.00000f, 
         -0.99341f,  -0.08787f,  -0.07356f,  -0.94156f,  -0.27264f,  -0.19784f, 
         -0.00000f,   0.99925f,  -0.03871f,  -0.00000f,   0.99925f,  -0.03871f, 
          0.99433f,  -0.08554f,  -0.06318f,   0.00000f,  -0.99814f,  -0.06104f, 
          0.00000f,  -0.99814f,  -0.06104f,  -0.85175f,  -0.37840f,  -0.36241f, 
         -0.99755f,  -0.03545f,  -0.06026f,  -0.00000f,   0.94590f,  -0.32447f, 
         -0.00000f,   0.94590f,  -0.32447f,   0.85297f,  -0.37835f,  -0.35957f, 
          0.00000f,  -0.99999f,  -0.00324f,   0.00000f,  -0.99999f,  -0.00324f, 
         -0.99935f,  -0.03552f,  -0.00625f,  -0.99496f,  -0.08380f,  -0.05514f, 
         -0.00000f,   1.00000f,  -0.00000f,  -0.00000f,   1.00000f,  -0.00000f, 
          0.99935f,  -0.03551f,   0.00625f,   0.00000f,  -0.98235f,  -0.18703f, 
          0.00000f,  -0.98235f,  -0.18703f,  -0.95355f,  -0.08031f,  -0.29035f, 
         -0.00000f,   0.97603f,  -0.21766f,  -0.00000f,   0.97602f,  -0.21766f, 
          0.95679f,  -0.08057f,  -0.27939f,   0.94243f,   0.00000f,  -0.33441f, 
          0.00000f,  -0.73290f,  -0.68034f,   0.00000f,  -0.73290f,  -0.68034f, 
         -0.00000f,   0.80677f,   0.59086f,  -0.00000f,   0.80677f,   0.59086f, 
         -0.82286f,  -0.55110f,   0.13855f,  -0.75605f,  -0.57982f,   0.30363f, 
          0.00000f,  -0.88092f,  -0.47327f,   0.00000f,  -0.88092f,  -0.47327f, 
          0.82321f,  -0.54972f,   0.14189f,  -0.00000f,   0.97644f,   0.21577f, 
         -0.00000f,   0.97644f,   0.21577f,  -0.95320f,  -0.29475f,  -0.06735f, 
          0.00000f,  -0.99988f,  -0.01532f,   0.00000f,  -0.99988f,  -0.01532f, 
          0.95334f,  -0.29524f,  -0.06302f,   0.90459f,  -0.42626f,  -0.00542f, 
         -0.93867f,  -0.00000f,  -0.34481f,   0.99556f,  -0.08384f,  -0.04272f, 
          0.99775f,  -0.03546f,  -0.05696f,   0.94600f,  -0.26613f,  -0.18511f, 
          0.92814f,  -0.07985f,  -0.36357f,   0.75708f,  -0.57804f,   0.30446f, 
         -0.90284f,  -0.42992f,  -0.00769f,   0.54340f,  -0.83947f,   0.00000f, 
          0.54340f,  -0.83947f,   0.00000f,   0.54340f,  -0.83947f,   0.00000f, 
         -0.54340f,  -0.83948f,  -0.00000f,   1.00000f,   0.00000f,   0.00000f, 
         -1.00000f,  -0.00000f,  -0.00000f,  -0.54340f,   0.83947f,  -0.00000f, 
         -0.54511f,   0.83837f,  -0.00000f,  -0.54511f,   0.83837f,  -0.00000f, 
         -0.54511f,   0.83837f,  -0.00000f,  -1.00000f,  -0.00000f,  -0.00000f
    };

    private static final float [] TEXTURE_COORDINATE_DATA = new float [] {
          0.58f,   0.40f,   0.52f,   0.40f,   0.58f,   0.10f, 
          0.52f,   0.40f,   0.49f,   0.40f,   0.52f,   0.10f, 
          0.49f,   0.40f,   0.43f,   0.40f,   0.49f,   0.10f, 
          0.43f,   0.40f,   0.38f,   0.40f,   0.43f,   0.10f, 
          0.63f,   0.40f,   0.58f,   0.40f,   0.58f,   0.10f, 
          0.58f,   0.10f,   0.63f,   0.10f,   0.63f,   0.20f, 
          0.58f,   0.10f,   0.63f,   0.20f,   0.63f,   0.30f, 
          0.63f,   0.40f,   0.58f,   0.10f,   0.63f,   0.30f, 
          0.72f,   0.27f,   0.66f,   0.31f,   0.66f,   0.36f, 
          0.66f,   0.36f,   0.72f,   0.39f,   0.72f,   0.27f, 
          0.72f,   0.27f,   0.72f,   0.39f,   0.78f,   0.31f, 
          0.78f,   0.31f,   0.72f,   0.39f,   0.78f,   0.36f, 
          0.72f,   0.27f,   0.66f,   0.24f,   0.66f,   0.19f, 
          0.72f,   0.16f,   0.78f,   0.19f,   0.78f,   0.24f, 
          0.66f,   0.19f,   0.72f,   0.16f,   0.78f,   0.24f, 
          0.72f,   0.27f,   0.66f,   0.19f,   0.78f,   0.24f, 
          0.34f,   0.10f,   0.38f,   0.10f,   0.38f,   0.20f, 
          0.38f,   0.20f,   0.34f,   0.20f,   0.34f,   0.10f, 
          0.38f,   0.40f,   0.34f,   0.40f,   0.38f,   0.30f, 
          0.99f,   0.77f,   0.99f,   0.69f,   0.80f,   0.69f, 
          0.80f,   0.69f,   0.80f,   0.77f,   0.99f,   0.77f, 
          0.84f,   0.14f,   0.84f,   0.18f,   0.88f,   0.18f, 
          0.88f,   0.18f,   0.88f,   0.14f,   0.84f,   0.14f, 
          0.99f,   0.69f,   0.99f,   0.77f,   0.80f,   0.77f, 
          0.80f,   0.77f,   0.80f,   0.69f,   0.99f,   0.69f, 
          0.99f,   0.77f,   0.99f,   0.80f,   0.80f,   0.80f, 
          0.80f,   0.80f,   0.80f,   0.77f,   0.99f,   0.77f, 
          0.11f,   0.40f,   0.06f,   0.40f,   0.11f,   0.10f, 
          0.31f,   0.40f,   0.26f,   0.40f,   0.26f,   0.10f, 
          0.26f,   0.10f,   0.31f,   0.10f,   0.31f,   0.20f, 
          0.26f,   0.10f,   0.31f,   0.20f,   0.31f,   0.30f, 
          0.31f,   0.40f,   0.26f,   0.10f,   0.31f,   0.30f, 
          0.26f,   0.40f,   0.21f,   0.40f,   0.21f,   0.10f, 
          0.21f,   0.10f,   0.26f,   0.10f,   0.26f,   0.40f, 
          0.21f,   0.40f,   0.17f,   0.40f,   0.17f,   0.10f, 
          0.17f,   0.10f,   0.21f,   0.10f,   0.21f,   0.40f, 
          0.17f,   0.40f,   0.11f,   0.40f,   0.11f,   0.10f, 
          0.11f,   0.10f,   0.17f,   0.10f,   0.17f,   0.40f, 
          0.72f,   0.27f,   0.66f,   0.31f,   0.66f,   0.36f, 
          0.72f,   0.27f,   0.66f,   0.36f,   0.72f,   0.39f, 
          0.78f,   0.31f,   0.72f,   0.27f,   0.72f,   0.39f, 
          0.78f,   0.36f,   0.78f,   0.31f,   0.72f,   0.39f, 
          0.72f,   0.27f,   0.66f,   0.24f,   0.66f,   0.19f, 
          0.72f,   0.16f,   0.78f,   0.19f,   0.78f,   0.24f, 
          0.66f,   0.19f,   0.72f,   0.16f,   0.78f,   0.24f, 
          0.72f,   0.27f,   0.66f,   0.19f,   0.78f,   0.24f, 
          0.02f,   0.10f,   0.06f,   0.10f,   0.02f,   0.20f, 
          0.06f,   0.40f,   0.02f,   0.40f,   0.02f,   0.30f, 
          0.02f,   0.30f,   0.06f,   0.30f,   0.06f,   0.40f, 
          0.17f,   0.92f,   0.17f,   0.96f,   0.28f,   0.98f, 
          0.28f,   0.98f,   0.28f,   0.83f,   0.17f,   0.92f, 
          0.99f,   0.69f,   0.80f,   0.69f,   0.83f,   0.60f, 
          0.83f,   0.60f,   0.96f,   0.60f,   0.99f,   0.69f, 
          0.17f,   0.78f,   0.17f,   0.74f,   0.28f,   0.79f, 
          0.84f,   0.92f,   0.96f,   0.92f,   0.93f,   0.97f, 
          0.93f,   0.97f,   0.87f,   0.97f,   0.84f,   0.92f, 
          0.28f,   0.83f,   0.28f,   0.98f,   0.52f,   0.97f, 
          0.52f,   0.97f,   0.41f,   0.84f,   0.28f,   0.83f, 
          0.96f,   0.60f,   0.83f,   0.60f,   0.85f,   0.42f, 
          0.85f,   0.42f,   0.95f,   0.42f,   0.96f,   0.60f, 
          0.28f,   0.79f,   0.28f,   0.65f,   0.52f,   0.79f, 
          0.28f,   0.46f,   0.28f,   0.62f,   0.41f,   0.59f, 
          0.41f,   0.59f,   0.41f,   0.49f,   0.28f,   0.46f, 
          0.41f,   0.84f,   0.52f,   0.97f,   0.57f,   0.96f, 
          0.57f,   0.96f,   0.57f,   0.84f,   0.41f,   0.84f, 
          0.95f,   0.42f,   0.85f,   0.42f,   0.87f,   0.38f, 
          0.87f,   0.38f,   0.93f,   0.38f,   0.95f,   0.42f, 
          0.52f,   0.79f,   0.41f,   0.66f,   0.57f,   0.77f, 
          0.41f,   0.49f,   0.41f,   0.59f,   0.57f,   0.58f, 
          0.57f,   0.58f,   0.57f,   0.50f,   0.41f,   0.49f, 
          0.57f,   0.84f,   0.57f,   0.96f,   0.70f,   0.96f, 
          0.70f,   0.96f,   0.70f,   0.86f,   0.57f,   0.84f, 
          0.93f,   0.38f,   0.87f,   0.38f,   0.86f,   0.27f, 
          0.86f,   0.27f,   0.93f,   0.27f,   0.93f,   0.38f, 
          0.57f,   0.77f,   0.57f,   0.66f,   0.70f,   0.77f, 
          0.57f,   0.50f,   0.57f,   0.58f,   0.71f,   0.57f, 
          0.71f,   0.57f,   0.71f,   0.50f,   0.57f,   0.50f, 
          0.70f,   0.86f,   0.70f,   0.96f,   0.77f,   0.92f, 
          0.93f,   0.27f,   0.86f,   0.27f,   0.88f,   0.22f, 
          0.88f,   0.22f,   0.91f,   0.22f,   0.93f,   0.27f, 
          0.70f,   0.77f,   0.70f,   0.68f,   0.77f,   0.73f, 
          0.77f,   0.73f,   0.77f,   0.76f,   0.70f,   0.77f, 
          0.71f,   0.50f,   0.71f,   0.57f,   0.77f,   0.56f, 
          0.77f,   0.56f,   0.77f,   0.52f,   0.71f,   0.50f, 
          0.80f,   0.80f,   0.99f,   0.80f,   0.96f,   0.84f, 
          0.96f,   0.84f,   0.84f,   0.84f,   0.80f,   0.80f, 
          0.90f,   0.16f,   0.89f,   0.03f,   0.95f,   0.04f, 
          0.95f,   0.04f,   0.95f,   0.16f,   0.90f,   0.16f, 
          0.28f,   0.62f,   0.28f,   0.46f,   0.23f,   0.50f, 
          0.23f,   0.50f,   0.23f,   0.59f,   0.28f,   0.62f, 
          0.89f,   0.03f,   0.90f,   0.16f,   0.95f,   0.04f, 
          0.84f,   0.84f,   0.96f,   0.84f,   0.96f,   0.92f, 
          0.96f,   0.92f,   0.84f,   0.92f,   0.84f,   0.84f, 
          0.13f,   0.90f,   0.23f,   0.81f,   0.01f,   0.88f, 
          0.23f,   0.59f,   0.23f,   0.50f,   0.01f,   0.50f, 
          0.01f,   0.50f,   0.01f,   0.59f,   0.23f,   0.59f, 
          0.23f,   0.62f,   0.13f,   0.71f,   0.01f,   0.69f, 
          0.01f,   0.69f,   0.01f,   0.62f,   0.23f,   0.62f, 
          0.70f,   0.96f,   0.77f,   0.95f,   0.77f,   0.92f, 
          0.57f,   0.66f,   0.70f,   0.68f,   0.70f,   0.77f, 
          0.41f,   0.66f,   0.57f,   0.66f,   0.57f,   0.77f, 
          0.28f,   0.65f,   0.41f,   0.66f,   0.52f,   0.79f, 
          0.17f,   0.74f,   0.28f,   0.65f,   0.28f,   0.79f, 
          0.90f,   0.16f,   0.95f,   0.16f,   0.95f,   0.04f, 
          0.23f,   0.81f,   0.01f,   0.81f,   0.01f,   0.88f, 
          0.38f,   0.20f,   0.38f,   0.10f,   0.43f,   0.10f, 
          0.38f,   0.30f,   0.38f,   0.20f,   0.43f,   0.10f, 
          0.38f,   0.40f,   0.38f,   0.30f,   0.43f,   0.10f, 
          0.43f,   0.40f,   0.43f,   0.10f,   0.49f,   0.10f, 
          0.34f,   0.40f,   0.34f,   0.30f,   0.38f,   0.30f, 
          0.49f,   0.40f,   0.49f,   0.10f,   0.52f,   0.10f, 
          0.52f,   0.40f,   0.52f,   0.10f,   0.58f,   0.10f, 
          0.06f,   0.20f,   0.06f,   0.10f,   0.11f,   0.10f, 
          0.06f,   0.30f,   0.06f,   0.20f,   0.11f,   0.10f, 
          0.06f,   0.40f,   0.06f,   0.30f,   0.11f,   0.10f, 
          0.06f,   0.10f,   0.06f,   0.20f,   0.02f,   0.20f
    };

    public Cottonmouth(Alite alite) {
        super(alite, "Cottonmouth", ObjectType.EnemyShip);
        shipType = ShipType.Cottonmouth;
        boundingBox = new float [] {-132.00f, 132.00f, -65.00f,  65.00f, -239.68f, 239.68f};
        numberOfVertices = 348;
        textureFilename = "textures/cottonmouth.png";
        maxSpeed          = 367.4f;
        maxPitchSpeed     = 1.500f;
        maxRollSpeed      = 2.750f;
        hullStrength      = 160.0f;
        hasEcm            = true;
        cargoType         = 13;
        aggressionLevel   = 10;
        escapeCapsuleCaps = 0;
        bounty            = 100;
        score             = 160;
        legalityType      = 1;
        maxCargoCanisters = 1;
        laserHardpoints.add(VERTEX_DATA[54]);
        laserHardpoints.add(VERTEX_DATA[55]);
        laserHardpoints.add(VERTEX_DATA[56]);
        laserHardpoints.add(VERTEX_DATA[63]);
        laserHardpoints.add(VERTEX_DATA[64]);
        laserHardpoints.add(VERTEX_DATA[65]);
        init();
        laserColor = 0x7F00FFFFl;
        laserTexture = "textures/laser_cyan.png";
    }

    @Override
    protected void init() {
        vertexBuffer = createFaces(VERTEX_DATA, NORMAL_DATA,
                0,   1,   2,   1,   3,   4,   3,   5,   6,   5,   7,   8,   9,   0,   2, 
                2,  10,  11,   2,  11,  12,   9,   2,  12,   5,   3,   1,   1,   0,   5, 
                5,   0,   7,   7,   0,   9,   2,   4,   6,   8,  13,  10,   6,   8,  10, 
                2,   6,  10,  10,  13,  14,  14,  11,  10,   7,   9,  15,  14,  15,  16, 
               16,  17,  14,  18,  19,  20,  20,  21,  18,  12,  11,  22,  22,  23,  12, 
               11,  14,  17,  17,  22,  11,  24,  25,  26,  27,  28,  29,  29,  30,  17, 
               29,  17,  16,  27,  29,  16,  28,  31,  32,  32,  29,  28,  31,  33,  34, 
               34,  32,  31,  33,  24,  26,  26,  34,  33,  28,  27,  25,  28,  25,  24, 
               31,  28,  24,  33,  31,  24,  26,  35,  30,  29,  32,  34,  30,  29,  34, 
               26,  30,  34,  30,  35,  17,  25,  27,  16,  16,  23,  25,  15,  12,  36, 
               36,  37,  15,  12,  23,  38,  38,  36,  12,  23,  16,  38,  39,  40,  41, 
               41,  42,  39,  37,  36,  43,  43,  44,  37,  36,  38,  45,  45,  43,  36, 
               38,  46,  45,  46,  37,  44,  44,  47,  46,  44,  43,  48,  48,  49,  44, 
               43,  45,  50,  50,  48,  43,  45,  47,  50,  47,  44,  49,  49,  51,  47, 
               49,  48,  52,  52,  53,  49,  48,  50,  54,  54,  52,  48,  50,  51,  54, 
               51,  49,  53,  53,  55,  51,  53,  52,  18,  52,  54,  20,  20,  19,  52, 
               54,  55,  21,  21,  20,  54,  55,  53,  18,  18,  21,  55,  16,  15,  56, 
               56,  57,  16,  15,  37,  58,  58,  56,  15,  37,  46,  59,  59,  58,  37, 
               46,  16,  59,  57,  56,  40,  40,  39,  57,  56,  58,  40,  58,  59,  42, 
               42,  41,  58,  59,  57,  39,  39,  42,  59,  52,  19,  18,  51,  55,  54, 
               47,  51,  50,  46,  47,  45,  16,  46,  38,  16,  57,  59,  58,  41,  40, 
               14,  13,   8,  15,  14,   8,   7,  15,   8,   5,   8,   6,   9,  12,  15, 
                3,   6,   4,   1,   4,   2,  22,  35,  26,  23,  22,  26,  25,  23,  26, 
               35,  22,  17);
        texCoordBuffer = GlUtils.toFloatBufferPositionZero(TEXTURE_COORDINATE_DATA);
        alite.getTextureManager().addTexture(textureFilename);
        if (Settings.engineExhaust) {
        	addExhaust(new EngineExhaust(this, 20, 20, 220, -100, -30, 0));
        	addExhaust(new EngineExhaust(this, 20, 20, 220, 100, -30, 0));
        }
        initTargetBox();
    }

    @Override
    public boolean isVisibleOnHud() {
        return true;
    }

    @Override
    public Vector3f getHudColor() {
        return HUD_COLOR;
    }

    @Override
    public float getDistanceFromCenterToBorder(Vector3f dir) {
        return 50.0f;
    }
}
