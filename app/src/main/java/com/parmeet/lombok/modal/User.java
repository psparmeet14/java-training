package com.parmeet.lombok.modal;

import lombok.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter @Setter
@ToString(exclude = {"events"})
@EqualsAndHashCode // In general, we should avoid using Lombok to generate the equals() and hashCode() methods for our JPA entities.
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    private @Setter(AccessLevel.PROTECTED) Long id;
    private String firstName;
    private final String lastName;
    private final int age;
    private List<UserEvent> events;

    @Getter(lazy = true)
    private final Map<String, Long> transactions = getTransactions();

    private Map<String, Long> getTransactions() {
        final Map<String, Long> cache = new HashMap<>();
        List<String> txnRows = Collections.emptyList();

        txnRows.forEach(s -> {
            String[] splittxnIdValueTuple = s.split(":");
            cache.put(splittxnIdValueTuple[0], Long.parseLong(splittxnIdValueTuple[1]));

        });
        return cache;
    }
}
