package Book4.chapter6;

import java.util.ArrayList;

public class Spell {

    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear."));
        spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something."));
        spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));

        for(Spell spell : spells){
            System.out.println(spell.name);
        }   //Printing each spell on the console using for loop
    }

    public Spell(String spellName, SpellType spellType, String spellDescription){
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    public String toString(){
        return name;
    }
}
