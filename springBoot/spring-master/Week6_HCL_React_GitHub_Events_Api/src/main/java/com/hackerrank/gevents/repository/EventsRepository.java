package com.hackerrank.gevents.repository;
import org.springframework.data.repository.CrudRepository;

import com.hackerrank.gevents.model.Event;
public interface EventsRepository extends CrudRepository<Event, Integer>
{
}
