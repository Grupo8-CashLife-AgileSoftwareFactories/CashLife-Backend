package com.cashbudget.cashlife.platform.inflationReport.infrastructure.persistence.jpa;

import com.cashbudget.cashlife.platform.inflationReport.domain.model.InflationReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InflationReportRepository extends JpaRepository<InflationReport, Long> {
}
