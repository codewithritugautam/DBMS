package com.ritu.batch9.laibrary.management.Laibrary.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritu.batch9.laibrary.management.Laibrary.Management.System.model.LaibraryManagement;
import com.ritu.batch9.laibrary.management.Laibrary.Management.System.repository.LaibraryManagementRepository;

@RestController
@RequestMapping("/laibrary")
public class LaibraryManagementSystemController {
@Autowired
LaibraryManagementRepository rcb;
@PostMapping("/save")
public void savelai_Book(@RequestBody LaibraryManagementRepository rc) {
rcb.saveAll(rc);
}
@RequestMapping("/details")
public List<LaibraryManagement> getBooks() {
return rcb.findAll();
}
@RequestMapping("/update/{lai_id}/{lai_bookName}")
public void updatelai_Book(@PathVariable("id")Long id,@PathVariable("lai_bookName")String bname) {
	LaibraryManagement rmt = rcb.findById(id).get();
rmt.setLai_authName(bname);
rcb.save(rmt);
}
@RequestMapping("/details/{lai_id}")
public LaibraryManagement getById(@PathVariable("id")Long id) {
return rcb.findById(id).get();
}
@RequestMapping("/delete/{id}")
public void deletelai_Book(@PathVariable("id")Long id) {
rcb.deleteById(id);
}
}

