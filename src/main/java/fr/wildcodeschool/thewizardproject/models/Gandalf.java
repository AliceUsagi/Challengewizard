package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gandalf implements WizardInterface {

    @Autowired
    private Outfit outfit;

    private DressAdviceInterface dressAdvice;

    @Override
    public String giveAdvice() {
        return "Frodon Saquet";
    }

    @Override
    public String changeDress() {
        return outfit.dressWizard();
    }
}
