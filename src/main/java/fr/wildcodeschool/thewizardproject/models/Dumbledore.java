package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dumbledore implements WizardInterface {

    @Autowired
    private Outfit outfit;

    @Override
    public String giveAdvice() {
        return "Harry Potter";
    }

    @Override
    public String changeDress() {
        return outfit.dressWizard();
    }
}
