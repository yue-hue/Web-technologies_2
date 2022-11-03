package service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Entity;
import entity.Kettle;
import entity.Microwave;
import entity.Fridge;
import entity.Iron;
import service.IService;

public class Service implements IService {

    private String filepath;

    public ArrayList<Kettle> kettleList = new ArrayList<>();
    public ArrayList<Microwave> microwaveList = new ArrayList<>();
    public ArrayList<Fridge> fridgeList = new ArrayList<>();
    public ArrayList<Iron> ironList = new ArrayList<>();


    public ArrayList<ArrayList> createFullList() {
        ArrayList<ArrayList> appliances = new ArrayList<>();

        appliances.add(kettleList);
        appliances.add(microwaveList);
        appliances.add(fridgeList);
        appliances.add(ironList);

        return appliances;
    }

    @Override
    public void getFullList() {
        ArrayList<ArrayList> appliances = new ArrayList<>();

        List<String> applianceList = getStringsFromFile();
        getInfoFromApplianceList(applianceList);

        appliances = createFullList();

        for (int i = 0; i < appliances.size(); i++) {
            for (int j = 0; j < appliances.get(i).size(); j++) {
                System.out.println(appliances.get(i).get(j).toString());
            }
        }
        System.out.println("\n");
    }

    @Override
    public void getKettles() {
        for (int i = 0; i < kettleList.size(); i++) {
            System.out.println(kettleList.get(i).toString());
        }
        System.out.println("\n");
    }

    @Override
    public void getLowestPriceProductInfo() {
        double minPrice = 1000;
        int id = 0;
        int product = 0;

        for(int i = 0; i < kettleList.size(); i++) {
            if (kettleList.get(i).getPrice() < minPrice) {
                minPrice = kettleList.get(i).getPrice();
                id= i;
                product = 1;
            }
        }
        for(int i = 0; i < microwaveList.size(); i++) {
            if (microwaveList.get(i).getPrice() < minPrice) {
                minPrice = microwaveList.get(i).getPrice();
                id= i;
                product = 2;
            }
        }
        for(int i = 0; i < fridgeList.size(); i++) {
            if (fridgeList.get(i).getPrice() < minPrice) {
                minPrice = fridgeList.get(i).getPrice();
                id= i;
                product = 3;
            }
        }
        for(int i = 0; i < ironList.size(); i++) {
            if (ironList.get(i).getPrice() < minPrice) {
                minPrice = ironList.get(i).getPrice();
                id= i;
                product = 4;
            }
        }

        if (product == 1) {
            System.out.println(kettleList.get(id));
        } else if (product == 2) {
            System.out.println(microwaveList.get(id));
        } else if (product == 3) {
            System.out.println(fridgeList.get(id));
        } else if (product == 4) {
            System.out.println(ironList.get(id));
        }
    }

    void fillLists(String str) {
        String[] words = str.split("\\,");
        switch (words[0]) {
            case "Kettle": {
                kettleList.add(new Kettle(words[1], words[2], words[3], words[4], words[5], Double.parseDouble(words[6])));
                break;
            }
            case "Microwave": {
                microwaveList.add(new Microwave(words[1], words[2], words[3], words[4], words[5], words[6], Double.parseDouble(words[7])));
                break;
            }
            case "Fridge": {
                fridgeList.add(new Fridge(words[1], words[2], words[3], words[4], words[5], words[6], Double.parseDouble(words[7])));
                break;
            }
            case "Iron": {
                ironList.add(new Iron(words[1], words[2], words[3], words[4], words[5], Double.parseDouble(words[6])));
                break;
            }
        }
    }

    private void getInfoFromApplianceList(List<String> applianceList) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < applianceList.size(); i++) {
            sb.append(applianceList.get(i));

            int index = 0;
            int lastIndex = sb.lastIndexOf("<") - 1;

            result.append(sb.substring(sb.indexOf("<", index) + 1, sb.indexOf(">", index))).append(",");
            index = sb.indexOf(">", index)+1;

            while(index < lastIndex) {
                index = sb.indexOf(">", index)+1;

                result.append(sb.substring(index, sb.indexOf("<", index))).append(",");
                index = sb.indexOf(">", index)+1;
            }

            fillLists(result.toString());
            result.setLength(0);

            sb.delete(0, sb.length());
        }
    }

    private List<String> getStringsFromFile() {
        List<String> appliances_list = new ArrayList<>();

        try {
            FileReader reader = new FileReader(filepath);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNext()) {
                appliances_list.add(scanner.nextLine());
            }
            reader.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return appliances_list;
        }
    }

    public Service(String filepath) {
        this.filepath = filepath;
    }
}