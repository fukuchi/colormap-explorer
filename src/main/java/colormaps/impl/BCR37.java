/*
 * Copyright 2014 Fraunhofer IGD
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package colormaps.impl;

import java.awt.Color;

import colormaps.AbstractColormap2D;
import colormaps.ColorSpace;

/**
 * <p>
 * Title: BCR37
 * </p>
 * 
 * <p>
 * Description: taken from Poster
 * "Cross-modal Sound-to-Sight Associations with Musical Timbre in Non-Synesthetes"
 * - William S. Griscom and Stephen E. Palmer - Department of Psychology,
 * University of California, Berkeley
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * 
 * @author J�rgen Bernard
 * 
 */

public class BCR37 extends AbstractColormap2D {

	@Override
	public Color getColor(float x, float y) {
		checkRanges(x, y);
		
		// red
		float r = 124.6f + 91.8f * x - 47.53f * y;

		// green
		float g = 98.8f + 77.73f * x + 23.066f * y;

		// blue
		float b = 145.9f - 36.3f * x + 12.7f * y;

		return new Color((int) r, (int) g, (int) b);
	}

	@Override
	public String getName() {
		return "BCR37";
	}

	@Override
	public String getDescription() {
		return "W. Griscom and S. Palmer. Violins are green, pianos are blue: Cross-modal sound-to-sight associations with timbre in synesthetes & non-synesthetes. Journal of Vision, 13(9):1169�1169, 2013.";
	}

	@Override
	public ColorSpace getColorSpace() {
		return ColorSpace.BCR37_CIE;
	}
}
