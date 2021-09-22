import javax.sound.sampled.Port;
public class Bonds {
    private String bondName;
    private double faceValue;
    private int numBonds;

    public Bonds() {
    }

    public Bonds(String bondName, double faceValue, int numBonds) {
        this.bondName = bondName;
        this.faceValue = faceValue;
        this.numBonds = numBonds;
    }

    public String getBondName() {
        return bondName;
    }

    public void setBondName(String bondName) {
        this.bondName = bondName;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    public int getNumBonds() {
        return numBonds;
    }

    public void setNumBonds(int numBonds) {
        this.numBonds = numBonds;
    }

    @Override
    public String toString() {
        return "Bonds{" +
                "bondName='" + bondName + '\'' +
                ", faceValue=" + faceValue +
                ", numBonds=" + numBonds +
                '}';
    }
}
