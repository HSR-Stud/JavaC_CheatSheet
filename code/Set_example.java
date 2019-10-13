Set<String> carModels = new HashSet<>();
carModels.add("Ferrari");
carModels.add("Maserati");
carModels.add("Lamborghini");
carModels.add("Ferrari"); // already present (no effect)
if(carModels.contains("Volkswagen")){...}