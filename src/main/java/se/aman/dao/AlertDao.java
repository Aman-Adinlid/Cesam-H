package se.aman.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public interface AlertDao {

    final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

}
