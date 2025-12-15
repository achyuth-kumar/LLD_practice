public interface LibraryAdmin {
    public void IssueBook(Integer StudentId,Integer BookId,Integer StartTime,Integer EndTime);
    public void ReturnBook(Integer StudentId,Integer BookId);
    public void Penalty(Integer StudentId,Integer BookId);
}
