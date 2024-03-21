public class Rolitas {

    //Atributos
    String Title;
    String Album;
    String Date;
    int Time;

    //Metodos
    //Primera forma
    /*public void Rolitas(String _Title, String _Album, String _Date,int _Time){
        Title=_Title;
        Album=_Album;
        Date=_Date;
        Time=_Time;
    }*/
    //Segunda forma (Constructor)
    public Rolitas(String Title, String Album, String Date, int Time){
        this.Title=Title;
        this.Album=Album;
        this.Date=Date;
        this.Time=Time;
    }
    public void ShowPlaylist(){
        System.out.println("Title "+Title);
        System.out.println("Album "+Album);
        System.out.println("Date "+Date);
        System.out.println("Time "+Time);
    }
}