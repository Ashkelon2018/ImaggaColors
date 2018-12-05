package telran.imagga.model;

import lombok.Getter;

@Getter
public class Color {
	String closest_palette_color_parent;
	String closest_palette_color;
	Double percent;
	
	@Override
	public String toString() {
		return closest_palette_color + "\t\t" + closest_palette_color_parent + "\t\t" + percent;
	}

}
