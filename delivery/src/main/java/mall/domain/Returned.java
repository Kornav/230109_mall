package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public Returned(Delivery aggregate){
        super(aggregate);
    }
    public Returned(){
        super();
    }
}
