package parte9.classesAbstratasPolimorfismo;

public abstract class Forma2d {
	//metodo abstrato, sei que deve ter o comportamento getArea, mas ainda não sei como
	public abstract double getArea(); 
	//outro metoddynho abstrato
	public abstract double getPerimetro();
	@Override
	public String toString() {
		//pega o nome da classe e retorna
		return this.getClass().getSimpleName();
	}
}
