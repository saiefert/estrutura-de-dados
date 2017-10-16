package LetraD;

public class Celula {

        protected int info;
        protected Celula ponteiro;

        /*  Constructor  */
        public Celula()
        {
            this.ponteiro = null;
            this.info = 0;
        }
        /*  Constructor  */
        public Celula(int info, Celula celula)
        {
            this.info = info;
            this.ponteiro = celula;
        }
        /*  Function to set ponteiro to next Celula  */
        public void setPonteiro(Celula celula)
        {
            this.ponteiro = celula;
        }
        /*  Function to set info to current Celula  */
        public void setInfo(int info)
        {
            this.info = info;
        }
        /*  Function to get ponteiro to next node  */
        public Celula getPonteiro()
        {
            return this.ponteiro;
        }
        /*  Function to get info from current Celula  */
        public int getInfo()
        {
            return this.info;
        }
    }
