package Book4.chapter6;

import java.util.ArrayList;

public class Spell {

    public String name;
    public SpellType type;
    public String description;
    public int price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear.",15));
        spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand.",10));
        spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something.",12));
        spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone.",10));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells.",15));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs.",15));

        //Printing each spell on the console using for loop
//        for(Spell spell : spells){
//            System.out.println(spell.name);
//        }


        // Printing each spell on console using stream
//        spells.stream().forEach(s -> System.out.println(s));


        // Listing out SPELLS using for loop
//        for (Spell spell : spells){
//            if(spell.type == Spell.SpellType.SPELL) System.out.println(spell.name);
//        }

        //Listing out SPELLS using streams
        spells.stream()
                .filter(s -> s.type == Spell.SpellType.SPELL)
                .forEach(s -> System.out.println(s));

    }

    public Spell(String spellName, SpellType spellType, String spellDescription, int price){
        this.name = spellName;
        this.type = spellType;
        this.description = spellDescription;
        this.price = price;
    }

    public String toString(){
        return name;
    }
}
