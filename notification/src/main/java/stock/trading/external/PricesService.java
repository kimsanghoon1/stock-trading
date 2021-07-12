
package stock.trading.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="pricing", url="http://pricing:8080")
public interface PricesService {
    @RequestMapping(method= RequestMethod.GET, path="/prices/{item}")
    public Prices getPrices(@PathVariable("item") String item);

}

