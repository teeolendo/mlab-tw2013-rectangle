
public class RectanglePrinter {

	private Rectangle rectangle; 
	private static final String border = "*"; 
	private static final String empty = " "; 
	private static final String new_line = "\n"; 
	
	public RectanglePrinter(Rectangle r) {
		rectangle = r;
	}

	public String draw() {
		StringBuffer result = new StringBuffer();

		headerFooterLine(result);
		
		for(int j = 0; j < rectangle.getHeight() - 2; j++ ){
			bodyLine(result);
		}
		
		if(rectangle.getHeight() > 1){
			headerFooterLine(result);
		}
		
		return result.toString();
	}

	private void bodyLine(StringBuffer result) {
		result.append(border);
		for(int i = 0; i < rectangle.getWidth() - 2; i++ ){
			result.append(empty);
		}
		result.append(border);
		result.append(new_line);
	}

	private void headerFooterLine(StringBuffer result) {
		for(int i = 0; i < rectangle.getWidth(); i++ ){
			result.append(border);
		}
		result.append(new_line);
	}

}
