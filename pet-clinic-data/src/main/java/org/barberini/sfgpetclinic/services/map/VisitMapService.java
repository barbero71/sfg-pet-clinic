package org.barberini.sfgpetclinic.services.map;

import org.barberini.sfgpetclinic.model.Visit;
import org.barberini.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if (visit.getPet() == null || visit.getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}