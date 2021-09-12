package top.calvinhaynes.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.calvinhaynes.entity.Order;

import javax.validation.Valid;

/**
 * @ProjectName: OrderController
 * @Author: CalvinHaynes
 * @Date: 2021/7/29 20:05
 * @Description: Taco订单的Controller
 */
@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {


    /*
     * Method Description:  get请求显示订单表单视图页面
     *
     * @param: [model]
     * @return: java.lang.String
     * @author: CalvinHaynes
     * @date: 2021/7/29 17:22
     */
    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }


    /*
     * Method Description:  填完订单之后的操作
     *
     * @param: [order, errors]
     * @return: java.lang.String
     * @author: CalvinHaynes
     * @date: 2021/7/29 17:21
     */
    @PostMapping
    public String processOrder(@Valid Order order, Errors errors) { //@Valid注解是检验用的
        if (errors.hasErrors()) {
            return "orderForm";
        }

        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
