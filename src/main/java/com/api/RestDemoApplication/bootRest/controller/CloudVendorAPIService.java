package com.api.RestDemoApplication.bootRest.controller;

import com.api.RestDemoApplication.bootRest.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
       return cloudVendor;
               // new CloudVendor("C1","Vendor 1","Address One","xxxx");

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor created successfully!!.";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor updated successfully!!.";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "Cloud Vendor deleted successfully!!.";
    }
}
