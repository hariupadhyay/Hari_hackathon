package com.hack.Hackathon.controller;


import com.hack.Hackathon.dto.ExecuteOrderDTO;
import com.hack.Hackathon.services.ExecuteOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecuteOrderController {

    @Autowired
    private ExecuteOrderService executeOrderService;

    public ResponseEntity<String> executeOrder(@RequestBody ExecuteOrderDTO executeOrderDto){
        executeOrderService.executeOrder(executeOrderDto);


        return null;

    }
}
