import java.util.*;


public class OperationHistoryManager {

    public OperationHistoryManager() {
    }

    public static void printall(OperationHistory[] history) {

        if (history == null) {
            return;
        } else
            for(int i = 0; i < history.length ; i++ )
            System.out.println(history[i]);
    }


    public static OperationHistory sortByOldest(List<OperationHistory> history){

        if(history == null){
            return null;
        }

            Collections.sort((List<OperationHistory>) history, new Comparator<OperationHistory>() {

                @Override
                public int compare(OperationHistory o1, OperationHistory o2) {
                    return o1.getOperationDate().compareTo(o2.getOperationDate());
                }

            });
        return null;
    }

    public static OperationHistory sortByNewest(List<OperationHistory> history){

        if(history == null){
            return null;
        }
        Collections.sort((List<OperationHistory>) history, new Comparator<OperationHistory>() {

            @Override
            public int compare(OperationHistory o1, OperationHistory o2) {
                return o2.getOperationDate().compareTo(o1.getOperationDate());
            }

        });
        return null;
    }

    public static boolean sortByDate(String history,  String date){

        if(history == null){
            return false;
        }
        return history.startsWith(date);
    }



}
