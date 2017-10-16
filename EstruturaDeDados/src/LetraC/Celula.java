package LetraC;
import java.util.Arrays;

public class Celula {

    private String info;
    private Celula ponteiro;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setPonteiro(Celula ponteiro) {
        this.ponteiro = ponteiro;
    }

    public Celula getPonteiro() {
        return ponteiro;
    }

    @Override
    public String toString() {
        return info.toString();
    }
}
