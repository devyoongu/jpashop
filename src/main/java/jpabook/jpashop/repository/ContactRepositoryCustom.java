package jpabook.jpashop.repository;

import java.util.List;
import jpabook.jpashop.domain.Contact;

public interface ContactRepositoryCustom {

    List<Contact> findByNameContaining(String name);

    List<Contact> findByPhoneNumberContaining(String phoneNumber);

}
