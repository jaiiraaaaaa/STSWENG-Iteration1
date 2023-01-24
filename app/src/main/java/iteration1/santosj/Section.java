package iteration1.santosj;

import org.apache.commons.lang3.*;
import static org.apache.commons.lang3.Validate.*;
import static org.apache.commons.lang3.StringUtils.*;

class Section {
    
    private final String sectionId;

    /**
     * CONSTRUCTOR
     */
    Section (String sectionId) {
        Validate.notBlank(sectionId);
        Validate.isTrue(StringUtils.isAlphanumeric(sectionId), "");
        this.sectionId = sectionId;
    }

    /**
     * OVERRIDDEN METHODS
     */
    @Override
    public String toString() {
        return "Section ID " + sectionId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Section section = (Section) o;
        return sectionId = o.sectionId;
    }

    @Override
    public hashcode () {

    }
}
