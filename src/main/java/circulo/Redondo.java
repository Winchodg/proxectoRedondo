package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Redondo
 * @author profesor
 */
public class Redondo {
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Redondo() {
    }

    public Redondo(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }





    private static final double LIMITERADIO = MINIMO;


    public double obterDiametro() {
        return getRadio() * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double valorRadio) {
        this.radio=(valorRadio < LIMITERADIO ? LIMITERADIO : valorRadio);
    }
}