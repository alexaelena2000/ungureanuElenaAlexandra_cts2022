package ro.ase.dice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends Readeable{
    public StudentiReader(String file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
           Student student = new Student();
           readAplicant(super.scanner,student);
            student.setAn_studii(super.scanner.nextInt());
            student.setFacultate (super.scanner.next().toString());
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }
}
