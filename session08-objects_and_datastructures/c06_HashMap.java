public class c06_HashMap {
	public static void main(String[] args) {
		HashMap<String, Double> symbols = new HashMap<String, Double>();
		symbols.put("AAPL", 116.60); // create new Double(116.6)
		symbols.put("BIDU", 176.76);

		Double d = symbols.get("XXX");
		if (d == null) {
			System.out.println("No such symbol");
		}
		Double d = symbols.get("AAPL");
		int x = d;
	}
}
