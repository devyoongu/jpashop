package jpabook.jpashop.controller;

import java.util.ArrayList;
import java.util.List;
import jpabook.jpashop.domain.Contact;
import jpabook.jpashop.dto.CommonResponse;
import jpabook.jpashop.dto.ContactDto.ContactSaveRequest;
import jpabook.jpashop.dto.ContactDto.ContactSearchRequest;
import jpabook.jpashop.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ContactController {

    private final ContactRepository contactRepository;
    @PostMapping("/api/contact")
    public ResponseEntity<CommonResponse> saveContact(@RequestBody ContactSaveRequest request) {
        Contact contactEntity = Contact.toEntity(request);
        Contact saved = contactRepository.save(contactEntity);

        return ResponseEntity.ok(CommonResponse.ok(saved));
    }

    @GetMapping("/api/contact")
    public ResponseEntity<CommonResponse> searchContact(ContactSearchRequest request) {
        List<Contact> searchList = new ArrayList<>();

        if (!StringUtils.isBlank(request.getName())) {
            searchList = contactRepository.findByNameContaining(request.getName());
        } else if (!StringUtils.isBlank(request.getPhoneNumber())) {
            searchList = contactRepository.findByPhoneNumberContaining(request.getPhoneNumber());
        } else {
            searchList = contactRepository.findAll();
        }

        return ResponseEntity.ok(CommonResponse.ok(searchList));
    }

}
