package at.campus02.zam21.pr1.Stack;

import java.time.LocalDate;

public class Note {

   public LocalDate date;   //etodi gete set me li risparmio perche pubblico
   public String title;
   public String description;

    public Note(LocalDate date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public Note(LocalDate now) {
    }

    @Override
    public String toString() {
        return "Note{" +
                "date=" + date +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
