package com.muthu.SpringSecurity.Controller;


import com.muthu.SpringSecurity.CouponRepository.CouponRepository;
import com.muthu.SpringSecurity.Entity.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
    @Autowired
    CouponRepository couponRepository;

    @RequestMapping(value = "/coupons",method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}",method = RequestMethod.GET)
    public Coupon getCoupons(@PathVariable("code") String code){
        return couponRepository.findByCode("Market");
    }

}
