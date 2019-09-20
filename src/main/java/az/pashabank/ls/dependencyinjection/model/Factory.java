package az.pashabank.ls.dependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factory {
    private String name;
    private Car car;
}
