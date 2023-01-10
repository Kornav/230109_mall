package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;

    public Returned(Delivery aggregate){
        super(aggregate);
    }
    public Returned(){
        super();
    }
}
