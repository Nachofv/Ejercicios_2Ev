package repaso2EV;


public class Automovil {

	private String modelo;
	private double deposito;
	private double combustible;
	private double consumo;
	private double km_recorrido;
	private double consumo_total;

	public Automovil(String modelo, double deposito, double combustible, double consumo, double km_recorrido,
			double consummo_total) {
		this.modelo = modelo;
		this.deposito = deposito;
		this.combustible = combustible;
		this.consumo = consumo;
		this.km_recorrido = 0;
		this.consumo_total = 0;
	}

	public Automovil(String modelo, double deposito, double consumo) {

		this.modelo = modelo;
		this.deposito = deposito;
		this.combustible = 0;
		this.consumo = consumo;
		this.km_recorrido = 0;
		this.consumo_total = 0;

	}

	public void llenarDeposito() {

		combustible = deposito;
	}

	public double llenarDeposito(double añadir_combustible) {

		if (combustible + añadir_combustible > deposito) {
			combustible = deposito;
		}
		return combustible + añadir_combustible - deposito;
	}

	public boolean Desplazarse(double km_recorrer) {

		double litros_necesarios = km_recorrer * consumo;

		if (litros_necesarios > combustible) {
			return false;
		}

		combustible = combustible - litros_necesarios;
		km_recorrido = km_recorrido + km_recorrer;
		consumo_total = consumo_total + litros_necesarios;
		return true;
	}

	public double getConsumo() {
		return consumo;
	}

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getConsumoTotal() {
		return consumo_total;
	}

	public void setConsumototal(double consummo_total) {
		this.consumo_total = consummo_total;
	}

	public double getKmRecorrido() {

		return km_recorrido;
	}

	public void setKmRecorrido(double km_recorrido) {
		this.km_recorrido = km_recorrido;
	}

	public String getModelo() {
		return modelo;
	}

