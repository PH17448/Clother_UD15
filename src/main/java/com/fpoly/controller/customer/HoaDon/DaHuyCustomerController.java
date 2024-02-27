package com.fpoly.controller.customer.HoaDon;

import com.fpoly.service.HoaDonCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DaHuyCustomerController {
    @Autowired
    HoaDonCustomerService hoaDonCustomerService;

    @RequestMapping("customer/DonHang/DaHuy")
    public String daHuyCustomer(@RequestParam(defaultValue = "1") int page,
                                @RequestParam(defaultValue = "3") int size,
                                Model model) {
        hoaDonCustomerService.danhSachDaHuyCustomer(page, size, model);
        return "customer/HoaDon/DanhSach/daHuyCustomer";
    }

    @RequestMapping("customer/DonHang/ChiTietHoaDon/DaHuy/hoa-don-id={id}")
    public String DaHuy(@PathVariable("id") Long id, Model model) {
        hoaDonCustomerService.chiTietDaHuyCustomer(id, model);
        return "customer/HoaDon/ChiTietHoaDon/CTDaHuyCustomer";
    }
}
