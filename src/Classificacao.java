
public enum Classificacao {
	
	VERDE(2),
	AMARELA(1),
	VERMELHA(0);
	
private int code;
	
	private Classificacao(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Classificacao valueOf(int code) {
		for (Classificacao value : Classificacao.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Classificacao code");
	}
	

}
