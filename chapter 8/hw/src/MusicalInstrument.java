public class MusicalInstrument {
    public String nameInstrument;
    public Boolean strunniy;
    public String colorInstrument;

    public MusicalInstrument(String nameInstrument, Boolean strunniy, String colorInstrument){
      this.nameInstrument  = nameInstrument;
      this.strunniy = strunniy;
      this.colorInstrument = colorInstrument;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "nameInstrument='" + nameInstrument + '\'' +
                ", strunniy=" + strunniy +
                ", colorInstrument='" + colorInstrument + '\'' +
                '}';
    }
}
