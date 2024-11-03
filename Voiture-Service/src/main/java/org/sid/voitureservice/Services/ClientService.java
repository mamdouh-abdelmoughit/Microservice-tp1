package org.sid.voitureservice.Services;



import org.sid.voitureservice.Entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService {
    @GetMapping(path="/client/{id}")
    Client clientById(@PathVariable Long id);
}

