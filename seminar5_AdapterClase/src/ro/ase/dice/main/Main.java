package ro.ase.dice.main;

import ro.ase.dice.clase.METROU.ValidatorMetrou;
import ro.ase.dice.clase.METROU.ValidatorScanare;
import ro.ase.dice.clase.STB.ValidatorAdapter;
import ro.ase.dice.clase.STB.ValidatorNFC;
import ro.ase.dice.clase.STB.ValidatorStb;

public class Main {

    private static void validareAbonamente(ValidatorStb validatorStb){
        validatorStb.validareAbonamentStb();
    }
    public static void main(String[] args) {
        ValidatorAdapter adapter = new ValidatorAdapter();
        adapter.validareBiltStb();
        adapter.validareAbonamentStb();
        //am creat functia noua pentru validare abonamente stb
        ValidatorStb validatorStb= new ValidatorNFC();
        validareAbonamente(validatorStb);

        //daca facem obiect de tip validare metrou nu avem cum sa apelam met validare abonamente, de aceea avem nevoie de adapter
        //daca am avea mai multe clase derivate din interfata ValidatorMetrou, folosim adapter de obiecte si in contructor ii dam o clasa din cele derivate
    }
}
