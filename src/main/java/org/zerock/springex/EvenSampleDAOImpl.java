package org.zerock.springex;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("event")
public class EvenSampleDAOImpl implements SampleDAO{
}