package newYearGift;

import sweets.Sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NewYearGift {
        ArrayList<Sweets> sweets;

        public NewYearGift(){
            sweets = new ArrayList<>();
        }

        public NewYearGift(ArrayList<Sweets> sweets){
            this.sweets = sweets;
        }

        public void add(Sweets sweet){
            sweets.add(sweet);
        }

        public void remove(Sweets sweet){
            sweets.remove(sweet);
        }

        public int getWeigthOfNewYearGift(){
            int weight = 0;
            for(int i = 0; i < sweets.size(); i++){
                weight += sweets.get(i).getWeight();

            }
            return weight;
        }

        public List<Sweets> sortListByQuantityOfSugar(){
            for(int i = 0; i < sweets.size(); i++){
                sweets.sort(Comparator.comparing(Sweets::getQuantityOfSugar));
                return sweets;
            }
            return null;
        }

        public List<String> getSweetsByQuantityOfSugar(int fromQuantitySugar, int toQuantitySugar){
            List<String> sweetsList = new ArrayList<String>();
            for(int i = 0; i < sweets.size(); i++){
                if(sweets.get(i).getQuantityOfSugar() < toQuantitySugar &&
                        sweets.get(i).getQuantityOfSugar() > fromQuantitySugar)
                    sweetsList.add(sweets.get(i).getName());
            }
            return sweetsList;
        }


        public int size(){
            return sweets.size();
        }
}
