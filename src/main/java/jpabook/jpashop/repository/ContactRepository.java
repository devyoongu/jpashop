package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long>, ContactRepositoryCustom {

}
