package com.company;


import java.util.Date;

public class Person {

    /**
     * "Строитель"
     */
    static class PersonBuilder {
        // Объект, инициализация которого выполняется в строителе
        private Person dummy = new Person();
        /**
         * Устанавливает имя человека
         *
         * @param name имя человека
         * @return ссылку на себя самого, чтобы обеспечить возможность
         * вызова методов по цепочке
         */
        public PersonBuilder name(String name) {
            dummy.name = name;
            return this;
        }
        public PersonBuilder lastName(String lastName) {
            dummy.lastName = lastName;
            return this;
        }
        public PersonBuilder birthDate(Date d) {
            dummy.bornDate = d;
            return this;
        }
        /**
         * Выполняет создание экземпляра класса {@link Person}
         *
         * @return экземпляр класса {@link Person}
         */
        public Person build() {
            Person result = dummy;
            dummy = new Person();
            return result;
        }
    }

    private String name;
    private String lastName;
    private Date bornDate;

    /**
     * Создаёт "Строитель" класса {@link Person}.
     *
     * @return экземпляр класса {@link PersonBuilder}.
     */
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
