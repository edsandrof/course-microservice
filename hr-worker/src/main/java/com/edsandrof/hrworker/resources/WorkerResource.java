package com.edsandrof.hrworker.resources;

import com.edsandrof.hrworker.entities.Worker;
import com.edsandrof.hrworker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = workerService.findAll();
        return ResponseEntity.ok().body(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(workerService.findById(id));
    }
}
