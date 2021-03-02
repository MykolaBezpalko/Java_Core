package task1.with_comporator;

import java.util.Comparator;

public class ComparatorCreating implements Comparator<Creating>
{

    @Override
    public int compare(Creating o1, Creating o2) {
        if((o1.getStage() - o2.getStage()) == 0){
            return o1.getName().compareTo(o2.getName());
        }else
            return o1.getStage() - o2.getStage();
    }
}
