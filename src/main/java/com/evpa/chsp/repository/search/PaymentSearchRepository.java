package com.evpa.chsp.repository.search;

import com.evpa.chsp.domain.Payment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data ElasticSearch repository for the Payment entity.
 */
public interface PaymentSearchRepository extends ElasticsearchRepository<Payment, Long> {
}
