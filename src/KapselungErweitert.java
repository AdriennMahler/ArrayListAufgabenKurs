import java.util.Date;
import java.util.Random;

public class KapselungErweitert {
    public static void main(String[] args) {
        Logger logger= new Logger();
      //  System.out.println(logger.getLog());
        logger.getLogSB().insert(1500, "XXXXXXXXXX");
        System.out.println(logger.getLogSB());
    }

}

class Logger{
    private String log="";
    private StringBuilder logSB=new StringBuilder("");


    Logger() {
        for (int i=0; i<1000; i++) {
            // this.log+="test: IP 192.168.0.2." + (new Random().nextInt(200)+40) + ", Datum "+new Date();
            logSB.append("test: IP 192.168.0.2." + (new Random().nextInt(200) + 40) + ", Datum " + new Date() + System.lineSeparator());
        }
    }

    public String getLog() {
        return log;
    }
        //Problem bei der Kapselung: das objekt ist mutable (veränderlich)
        //Lösung: es wird nicht das Originalobjekt zurückgeben, sondern eine Kopie!
        public StringBuilder getLogSB(){
          //  return logSB; //nicht korrekt, aknn von außen verändert werden
        return new StringBuilder(logSB); //Kopie konstruktor verwenden
        }

  /*  public void setLog(String log) {
        this.log = log;
    }*/
}
