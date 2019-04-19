package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final List<String> burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private final static String BUNWITHSESAME = "BUNWITHSESAME";
        private final static String BUNWITHOUTSESAME = "BUNWITHOUTSESAME";
        private final static String STANDARDSAUCE = "STANDARDSAUCE";
        private final static String BARBECUESAUCE = "BARBECUESAUCE";
        private final static String ISLANDSSAUCE = "ISLANDSSAUCE";
        private final static String ONION = "ONION";
        private final static String CUCUMBER = "CUCUMBER";
        private final static String LETUCE = "LETUCE";
        private final static String BEKON = "BEKON";
        private final static String CHILLI = "CHILLI";
        private final static String MUSHROOMS = "MUSHROOMS";
        private final static String SHRIMPS = "SHRIMPS";
        private final static String CHESE = "CHESE";

        private String bun;
        private List<String> burgers = new ArrayList<>();
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(String burger) {
            burgers.add(burger);
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() throws IllegalStateException {
            if (bun.equals(BUNWITHSESAME) || bun.equals(BUNWITHOUTSESAME)) {
                if (sauce.equals(STANDARDSAUCE) || sauce.equals(ISLANDSSAUCE) || sauce.equals(BARBECUESAUCE)) {
                    if (burgers.size() > 0) {
                        if (ingredients.size() > 0) {
                            for (int n = 0; n < ingredients.size(); n++) {
                                if ((ingredients.get(n).equals(ONION)) || (ingredients.get(n).equals(CUCUMBER)) || (ingredients.get(n).equals(LETUCE))
                                        || (ingredients.get(n).equals(BEKON)) || (ingredients.get(n).equals(CHILLI))
                                        || (ingredients.get(n).equals(MUSHROOMS)) || (ingredients.get(n).equals(SHRIMPS))
                                        || (ingredients.get(n).equals(CHESE))) {
                                }  else {
                                    throw new IllegalStateException();
                                }
                            }
                        }else {
                            throw new IllegalStateException();
                        }
                    }else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }


    private BigMac(final String bun, List<String> burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = new ArrayList<>(burgers);
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }
    public List<String> getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}